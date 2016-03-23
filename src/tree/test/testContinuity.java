package tree.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.mysql.jdbc.StringUtils;


public class testContinuity {

	public static void main(String[] args) {
		System.out.println(isContinuityCharacter("bc"));
		
	}
	
	private static boolean isContinuityCharacter(String s) {
		boolean continuity = true;
		char[] data = s.toCharArray();
		for (int i = 0; i < data.length - 1; i++) {
			int a = (int)data[i];
			int b = (int)data[i + 1];
			continuity = continuity && (a + 1 == b || a - 1 == b);
		}
		return continuity;
	}
	
	public static boolean isOrder(String str) {
		if (!(str.matches("((\\d)|([a-z])|([A-Z]))"))) {
			return false;
		}
		return true;
	}
	
    /** 
     * �ж��Ƿ���˳�� true������˳�� false��֮ 
     */  
    public static boolean isOrdered(String s){  
        boolean flag=false;  
        //��sΪ���ַ�������null,��Ϊ������ͬһ�ַ����ɵ�  
        if(s==null||s.equals("")){
        	return flag;
        }
//        if(StringUtils.isNullOrEmpty(s)){  
//            return flag;  
//        }  
        //��ֻ��һ���ַ���ʱ����Ϊ��ͬһ�ַ�����  
        if(1==s.length()){  
            flag=true;  
            return flag;  
        }  
        List<Integer> temp1= new ArrayList<Integer>();  
        List<Integer> temp2= new ArrayList<Integer>();  
        for(int i=0;i<s.length();i++){  
            temp1.add(Integer.valueOf(s.substring(i,i+1)));  
        }  
        for(int i=0;i<s.length();i++){  
            temp2.add(Integer.valueOf(s.substring(i,i+1)));  
        }  
        Collections.sort(temp1);  
        StringBuffer orderedAsc=new StringBuffer();  
        for(Integer i:temp1){  
            orderedAsc.append(i);  
        }  
        Collections.sort(temp2);  
        Collections.reverse(temp2);  
        StringBuffer orderedDec=new StringBuffer();  
        for(Integer i:temp2){  
            orderedDec.append(i);  
        }  
        if(s.equals(orderedDec.substring(0))||s.equals(orderedAsc.substring(0))){  
            flag=true;  
            return flag;  
        }  
        return flag;  
    }
	

}
