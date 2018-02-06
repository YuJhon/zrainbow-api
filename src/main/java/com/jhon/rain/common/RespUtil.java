package com.jhon.rain.common;

/**
 * <p>功能描述</br>返回值的统一定义</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName zrainbow-api
 * @date 2018/2/5 9:30
 */
public class RespUtil {
  /**
   * 默认成功
   **/
  public static final String DEFAULT_SUCCESS = "0";
  /**
   * 默认失败
   **/
  public static final String DEFAULT_SYSTEM_EXCEPTION = "999999";

  /**
   * <pre>默认处理成功</pre>
   *
   * @return 统一返回对象
   */
  public static RainResp ok() {
    RainResp rainResp = new RainResp();
    rainResp.setCode(RespUtil.DEFAULT_SUCCESS);
    return rainResp;
  }

  /**
   * <pre>处理成功自定义返回消息</pre>
   *
   * @param msg 自定义消息
   * @return 统一返回对象
   */
  public static RainResp ok(String msg) {
    RainResp rainResp = new RainResp();
    rainResp.setCode(RespUtil.DEFAULT_SUCCESS);
    rainResp.setMsg(msg);
    return rainResp;
  }

  /**
   * <pre>处理成功携带参数</pre>
   *
   * @param data 返回值的参数
   * @return 统一返回对象
   */
  public static RainResp ok(Object data) {
    RainResp rainResp = new RainResp();
    rainResp.setCode(RespUtil.DEFAULT_SUCCESS);
    rainResp.setData(data);
    return rainResp;
  }

  /**
   * <pre>自定义错误返回格式</pre>
   *
   * @param code 返回码
   * @param msg  错误消息
   * @return 统一返回对象
   */
  public static RainResp error(String code, String msg) {
    RainResp rainResp = new RainResp();
    rainResp.setCode(code);
    rainResp.setMsg(msg);
    return rainResp;
  }

  /**
   * <pre>自定义返回格式</pre>
   *
   * @param code 返回码
   * @param msg  错误消息
   * @param data 携带的对象
   * @return 统一返回对象
   */
  public static RainResp error(String code, String msg, Object data) {
    RainResp rainResp = new RainResp();
    rainResp.setCode(code);
    rainResp.setMsg(msg);
    rainResp.setData(data);
    return rainResp;
  }

  /**
   * <pre>系统异常的统一返回格式</pre>
   *
   * @param msg 自定义异常消息
   * @return 统一返回对象
   */
  public static RainResp systemExcp(String msg) {
    RainResp rainResp = new RainResp();
    rainResp.setCode(RespUtil.DEFAULT_SYSTEM_EXCEPTION);
    rainResp.setMsg(msg);
    return rainResp;
  }
}
