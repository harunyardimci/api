package com.harun.api.util;

public class GGResponse
{
    
    private Integer errCode;
    
    private String errMsg;

    private Object data;
    
    public Integer getErrCode()
    {
        return errCode;
    }

    public void setErrCode(Integer errCode)
    {
        this.errCode = errCode;
    }

    public String getErrMsg()
    {
        return errMsg;
    }

    public void setErrMsg(String errMsg)
    {
        this.errMsg = errMsg;
    }

    public Object getData()
    {
        return data;
    }

    public void setData(Object data)
    {
        this.data = data;
    }
    
    
}
