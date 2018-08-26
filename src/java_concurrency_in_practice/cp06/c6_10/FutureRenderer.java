//
//package java-concurrency_in_practice.cp06.c6_10;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.Callable;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Future;
//
//import com.sun.scenario.effect.ImageData;
//
//import designmode.cp3.application.version2.ImageInfo;
//
///**
//* @author nebo
//* @E-mail:nebofeng@gmail.com
//* @version creatTime：2017年3月6日 下午7:58:50
//* 类说明
//*/
//public class FutureRenderer {
//	private final ExecutorService executor=null;
//	void renderPage(CharSequence source){
//		final List<ImageInfo> imageInfos=scanForImageInfo(source);
//		Callable<List<ImageData>> task=
//				new Callable<List<ImageData>>(){
//					
//					public List<ImageData> call() throws Exception {
//						List<ImageData> result=
//								new ArrayList<ImageData>();
//						for(ImageInfo imageInfo: imageInfos){
//							result.add(imageInfo.downloadImage());
//						}
//						return result;
//					}
//			
//		};
//		
//	Future<List<ImageData>> future=executor.submit(task);
//	renderText(source);
//	try{
//		List<ImageData> imageData=future.get();
//		renderImage(imageData);
//	}catch(Exception e){
//		e.printStackTrace();
//	}
//}
//	
//	
//	
//	/** 
//	 * @Title: renderImage 
//	 * @Description: TODO
//	 * @return: void
//	 */
//	private void renderImage(List<ImageData> imageData) {
//		// TODO Auto-generated method stub
//		
//	}
//
//
//
//	/** 
//	 * @Title: renderText 
//	 * @Description: TODO
//	 * @return: void
//	 */
//	private void renderText(CharSequence source) {
//		// TODO Auto-generated method stub
//		
//	}
//
//
//
//	/** 
//	 * @Title: scanForImageInfo 
//	 * @Description: TODO
//	 * @return: List<ImageInfo>
//	 */
//	private List<ImageInfo> scanForImageInfo(CharSequence source) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
//}
