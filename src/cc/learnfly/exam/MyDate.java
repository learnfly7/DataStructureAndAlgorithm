/**  
 * @Title:  MyDate.java   
 * @Package cc.learnfly.exam   
 * @Description:    TODO   
 * @author: Schaffer chen     
 * @date:   2017年5月22日 下午3:57:53   
 * @version V1.0 
 * @Copyright: 2017  All rights reserved. 
 */
package cc.learnfly.exam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyDate {
	
	private Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public MyDate(){}
	/**
	 * 
	 * @Title: createByString   
	 * @Description: 根据字符串创建日期  
	 * @param: @param pattern
	 * @param: @throws ParseException      
	 * @return: void      
	 * @throws
	 */
	public void createByString(String pattern) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		date = sdf.parse(pattern);
	}
	
	/**
	 * 
	 * @Title: createByStamp   
	 * @Description: 根据时间戳创建日期  
	 * @param: @param stamp
	 * @param: @throws ParseException      
	 * @return: void      
	 * @throws
	 */
	public void createByStamp(String stamp) throws ParseException{
		Long st = new Long(stamp);
		date = new Date(st);
	}
	
	public String toString(){
		return date.toString();
	}
	
	/**
	 * 
	 * @Title: compareMyDate   
	 * @Description: 比较日期，小于返回-1，等于返回0，大于返回1  
	 * @param: @param myDate
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	public int compareMyDate(MyDate myDate){
		long t1 = this.date.getTime();
		long t2 = myDate.getDate().getTime();
		if(t1 < t2){
			return -1;
		}else if(t1 > t2){
			return 1;
		}else{
			return 0;
		}
	}
	
	/**
	 * 
	 * @Title: addDays   
	 * @Description: 在日期上加上天数 
	 * @param: @param days      
	 * @return: void      
	 * @throws
	 */
	public void addDays(int days){
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, days);
		date = cal.getTime();
	}
	
	/**
	 * 
	 * @Title: minusDays   
	 * @Description: 在日期上减去天数 
	 * @param: @param days      
	 * @return: void      
	 * @throws
	 */
	public void minusDays(int days){
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, -days);
		date = cal.getTime();
	}
	
	public static void main(String[] args) {
		MyDate myDate = new MyDate();
		try {
			//myDate.createByString("2017-05-22");
			myDate.createByStamp("1495443033928");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(myDate);
		myDate.addDays(30);
		System.out.println(myDate);
		myDate.minusDays(30);
		System.out.println(myDate);
		MyDate myDate2 = new MyDate();
		try {
			myDate2.createByString("2017-05-21");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(myDate.compareMyDate(myDate2));
	}
	
	

}
