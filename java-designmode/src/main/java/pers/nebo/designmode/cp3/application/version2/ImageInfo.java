//
//package designmode.cp3.application.version2;
//
//import com.sun.scenario.effect.ImageData;
//
///**
//* @author nebo
//* @E-mail:nebofeng@gmail.com
//* @version creatTime：2017年2月11日 上午11:11:29
//* 类说明
//*/
//public class ImageInfo {
//	private int width; 	//图像宽度
//
//	private int height;//图像高度
//	private int r[][]; // 红色分量
//	private int g[][];
//	private int b[][];
//	
//	public void setWidth(int width) {
//		this.width = width;
//	}
//	public void setHeight(int height) {
//		this.height = height;
//	}
//	public int getWidth() {
//		return width;
//	}
//	public int getHeight() {
//		return height;
//	}
//	public int[][] getR() {
//		return r;
//	}
//	public int[][] getG() {
//		return g;
//	}
//	public int[][] getB() {
//		return b;
//	}
//	
//	public void setRGB(int rgb[]){
//		r=new int[height][width];
//		g=new int[height][width];
//		b=new int[height][width];
//		
//		int pos=0;
//		for(int i=0;i<height;i++){
//			pos=width*i;
//			for(int j=0;j<width;j++){
//				r[i][j]=(rgb[pos+j]&0xff000)>>16;
//			    g[i][j]=(rgb[pos+j]&0xff000)>>8;
//			    b[i][j]= rgb[pos+j]&0xff000;
//
//				
//			}
//		}
//
//		
//	}
//	/** 
//	 * @Title: downloadImage 
//	 * @Description: TODO
//	 * @return: ImageData
//	 */
//	public ImageData downloadImage() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
//	
//	
//}
