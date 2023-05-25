package CriticalSection;

public class ClientManager {

  public static void main(String[] args) {

    FileProcess proceso1 = new FileProcess("Thread 1 is wrtting");
    proceso1.start();
    FileProcess proceso2 = new FileProcess("Thread 2 is writting");
    proceso2.start();
    FileProcess proceso3 = new FileProcess("Thread 3 is wrtting");
    proceso3.start();
    FileProcess proceso4 = new FileProcess("Thread 4 is writting");
    proceso4.start();
    FileProcess proceso5 = new FileProcess("Thread 5 is wrtting");
    proceso5.start();
  }
}

class FileProcess extends Thread {

  private String msgLog;

  public FileProcess(String msg) {
    this.msgLog = msg;
  }

  @Override
  public void run() {
    Logger fileLogger = FileLogger.getFileLogger();
    for (int i = 0; i < 50; i++) {
      fileLogger.log(msgLog);
    }
  }
}
