package org.soen387.app.common;

import java.lang.reflect.Method;
import java.util.List;

import org.soen387.app.rdg.BaseRDG;
import org.soen387.app.viewHelper.ViewHelper;

public class CommonUtil {

	/**
	 * TODO 判断参数是否为空
	 * 
	 * @param jsonName
	 * @param list
	 * @return
	 */
	public static boolean isEmpty(String str) {
		
		if(str == null || str.length()==0) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * TODO 将ViewHelper类型的容器转换为JSON中的参数
	 * 
	 * @param jsonName
	 * @param list
	 * @return
	 */
	public static String changeListToJsonPre(String jsonName,List<ViewHelper> list) {
		
		if(list == null || list.size()==0) {
			StringBuffer jsonBuf = new StringBuffer();
			jsonBuf.append("\"");
			jsonBuf.append(jsonName);
			jsonBuf.append("\":[]");
			return jsonBuf.toString();
		}
		
		StringBuffer jsonBuf = new StringBuffer();
		jsonBuf.append("\"");
		jsonBuf.append(jsonName);
		jsonBuf.append("\":[");
		
		list.forEach((viewHelper)->{
			jsonBuf.append(viewHelper.toJson());
			jsonBuf.append(",");
		});
		
		String substring = jsonBuf.substring(0, jsonBuf.lastIndexOf(","));
		
		return substring+"]";
	}
	
	/**
	 * TODO 将ViewHelper类型的容器转换为JSON
	 * 
	 * @param jsonName
	 * @param list
	 * @return
	 */
	public static String changeListToJson(String jsonName,List<ViewHelper> list) {
		
		if(list == null || list.size()==0) {
			StringBuffer jsonBuf = new StringBuffer();
			jsonBuf.append("{\"");
			jsonBuf.append(jsonName);
			jsonBuf.append("\":[]}");
			return jsonBuf.toString();
		}
		
		StringBuffer jsonBuf = new StringBuffer();
		jsonBuf.append("{\"");
		jsonBuf.append(jsonName);
		jsonBuf.append("\":[");
		
		list.forEach((viewHelper)->{
			jsonBuf.append(viewHelper.toJson());
			jsonBuf.append(",");
		});
		
		String substring = jsonBuf.substring(0, jsonBuf.lastIndexOf(","));
		
		return substring+"]}";
	}
	
	/**
	 * 利用BaseRDG子类的数据对实现ViewHelper的类进行赋值
	 * 
	 * @param baseRDG
	 * @param viewHelper
	 */
    public static void setPropToVH(BaseRDG baseRDG, ViewHelper viewHelper) {

    	Method[] srcMethods = baseRDG.getClass().getMethods();

        Method[] targetMethods = viewHelper.getClass().getMethods();

        for (Method m : srcMethods) {

            String srcName = m.getName();

            if (srcName.startsWith("get")) {

                try {

                    Object result = m.invoke(baseRDG);

                    for (Method mm : targetMethods) {

                        String targetName = mm.getName();

                        if (targetName.startsWith("set")
                        		&& targetName.substring(3, targetName.length())

                                .equals(srcName.substring(3, srcName.length()))) {

                            mm.invoke(viewHelper, result);

                        }

                    }

                } catch (Exception e) {
                	e.printStackTrace();
                }

            }

        }
    }
}
