package cc.learnfly.exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Alibaba2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<UnilateralLine> lineList = new ArrayList<UnilateralLine>();
        while (scanner.hasNextLine()) {
            String[] options = scanner.nextLine().split(";");
            if (options.length < 5) {
                break;
            }
            lineList.add(new UnilateralLine(options[0], options[1], options[2], options[3], options[4], options[5]));
        }
        scanner.close();

        // wirte your code here
        List<String> result = calculateUnilateral(lineList);

        for (String str : result) {
            System.out.println(str);
        }
    }
    public static List<String> calculateUnilateral(List<UnilateralLine> lineList) {
        List<String> result = new ArrayList<String>();
        //先找规则1
        int n = lineList.size();
        Set<String> result1 = new HashSet<String>();
        for(int i = 0; i < n; i++){
        	UnilateralLine line1 = lineList.get(i);
        	for(int j = i + 1; j < n; j++){
        		UnilateralLine line2 = lineList.get(j);
        		if(line1.getTType().equals(line2.getTType()) && line1.getSCen().equals(line2.getECen()) && line1.getECen().equals(line2.getSCen())){
        			result1.add("rule1:" + line1.getId() + "+" + line2.getId());
        		}
        	}
        }
        //rule2
        Set<String> result2 = new HashSet<String>();
        for(int i = 0 ; i < n; i++){
        	UnilateralLine line1 = lineList.get(i);
        	for(int j = 0; j < n; j++){
        		UnilateralLine line2 = lineList.get(j);
        		for(int k = 0; k < n; k++){
        			UnilateralLine line3 = lineList.get(k);
        			if(line1.getECen().equals(line2.getSCen()) && line2.getECen().equals(line3.getSCen()) && line3.getECen().equals(line1.getSCen())){
        				if(line1.getTType().equals(line2.getTType()) && line1.getTType().equals(line3.getTType())){
        					List<String> strList = new LinkedList<>();
        					strList.add(line1.getId());
        					strList.add(line2.getId());
        					strList.add(line3.getId());
        					Collections.sort(strList);
        					result2.add("rule2:"+strList.get(0)+"+" + strList.get(1)+"+" + strList.get(2));
        				}
        			}
        		}
        	}
        }
        //rule2
        Set<String> result3 = new HashSet<String>();
        for(int i =0; i< n; i++){
        	UnilateralLine line1 = lineList.get(i);
        	for(int j =0; j < n; j++){
        		UnilateralLine line2 = lineList.get(j);
        		if(line1.getSCen().equals(line2.getECen()) && line1.getEPro().equals(line2.getSPro()) && !line1.getECen().equals(line2.getSCen()) && line1.getTType().equals(line2.getTType())){
        			List<String> strList = new LinkedList<>();
					strList.add(line1.getId());
					strList.add(line2.getId());
					Collections.sort(strList);
					result3.add("rule3:"+strList.get(0)+"+" + strList.get(1));
        		}
        	}
        }
       result.addAll(new ArrayList<>(result1));
       result.addAll(new ArrayList<>(result2));
       result.addAll(new ArrayList<>(result3));
        return result;
    }
public static class UnilateralLine {
private String id;
private String sCen;//出发分拨
private String sPro;//出发省
private String eCen;//到达分拨
private String ePro;//到达省
//9.6m/17.5m
private String tType;//车型
public UnilateralLine(String id, String sCen, String sPro, String eCen, String ePro,String tType) {
            this.id = id;this.sCen = sCen;this.sPro = sPro;this.eCen = eCen;this.ePro = ePro;this.tType = tType;}
public String getId() {return id;}
public void setId(String id) {this.id = id;}
public String getSCen() {return sCen;}
public void setSCen(String ePro) {this.ePro = ePro;}
public String getSPro() {return sPro;}
public void setSPro(String sPro) {this.sPro = sPro;}
public String getECen() {return eCen;}
public void setECen(String eCen) {this.eCen = eCen;}
public String getEPro() {return ePro;}
public void setEPro(String ePro) {this.ePro = ePro;}
public String getTType() {return tType;}
public void setTType(String tType) {this.tType = tType;}
}
}