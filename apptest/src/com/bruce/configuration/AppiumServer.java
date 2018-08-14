package com.bruce.configuration;

import java.io.IOException;

import org.apache.commons.exec.*;

public class AppiumServer {

	public void startServer() {
		CommandLine command = new CommandLine("cmd");

		command.addArgument("/c");
		command.addArgument("appium");
		command.addArgument("--address");
		command.addArgument("127.0.0.1");
		command.addArgument("--port");
		command.addArgument("4723");
		command.addArgument("--no-reset");
		command.addArgument("--command-timeout");
		command.addArgument("6000");
		command.addArgument("--log");
		command.addArgument("D:/appiumLogs_2.txt");

		// 使用DefaultExecuteResultHandler处理外部命令执行的结果，释放当前线程
		DefaultExecuteResultHandler resultHandler = new DefaultExecuteResultHandler();
		DefaultExecutor executor = new DefaultExecutor();

		// https://blog.csdn.net/fd_mas/article/details/50147701

		executor.setExitValue(1);
		try {

			executor.execute(command, resultHandler);
			// 这里开始的代码会被立即执行下去，因为上面的语句不会被阻塞。
			resultHandler.waitFor(3000);// 等待5秒。
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void stopServer() {

		CommandLine command = new CommandLine("cmd");
		command.addArgument("/c");
		command.addArgument("taskkill");
		command.addArgument("/F");
		command.addArgument("/IM");
		command.addArgument("node.exe");

		DefaultExecuteResultHandler resultHandler = new DefaultExecuteResultHandler();
		DefaultExecutor executor = new DefaultExecutor();
		executor.setExitValue(1);

		try {
			executor.execute(command, resultHandler);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
