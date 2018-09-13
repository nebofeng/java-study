package pers.nebo.web.webhandler;

/**
 * @auther fnb
 * @date 2018/9/13 14:00
 */
public class TimeThread  extends Thread {

	@Override
	public void run() {
		 AliYunHttp.updateDataList();

	}
}
