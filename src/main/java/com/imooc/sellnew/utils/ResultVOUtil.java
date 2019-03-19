package com.imooc.sellnew.utils;

import com.imooc.sellnew.VO.ResultVO;
import org.aspectj.apache.bcel.classfile.Code;

/**
 * Created by Administrator on 2019/2/26 20:15
 */
public class ResultVOUtil {
    public static ResultVO success(Object object){
        ResultVO resultVO=new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }

    public static ResultVO success(){
        return success(null);
    }

    public static ResultVO error(Integer integer,String msg){
        ResultVO resultVO=new ResultVO();
        resultVO.setMsg(msg);
        resultVO.setCode(integer);
        return resultVO;
    }
}
