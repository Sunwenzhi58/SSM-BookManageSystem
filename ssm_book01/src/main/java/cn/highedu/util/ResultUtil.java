package cn.highedu.util;


public class ResultUtil {
    //封装返回的结果的数据
    private Object data;
    //封装返回的结果是GET/POST/DELETE/PUT,是否成功
    private Integer code;
    //操作失败了，返回的结果错误信息
    private String message;

    public ResultUtil() {
    }
    public ResultUtil(Integer code, Object data) {
        this.data = data;
        this.code = code;
    }
    public ResultUtil(Integer code, Object data, String message) {
        this.data = data;
        this.code = code;
        this.message = message;
    }
    //setter、gettter
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
