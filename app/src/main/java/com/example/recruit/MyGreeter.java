package com.example.recruit;

import java.util.Calendar;

/**
 * Author: 陈大伟 <br>
 * Data: 2025/7/16 23:46 <br>
 * Description:问候语
 */
public class MyGreeter {
    /**
     * 上午问候语
     */
    private static final String GREETING_MORNING = "Good morning";

    /**
     * 下午问候语
     */
    private static final String GREETING_AFTERNOON = "Good afternoon";

    /**
     * 晚上问候语
     */
    private static final String GREETING_EVENING = "Good evening";

    /**
     * 获取当前时间对应问候语
     *
     * @return 当前运行时间问候语
     */
    public String greeting() {
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        // 6-12点
        if (hour >= 6 && hour < 12) {
            return GREETING_MORNING;
        }
        // 12-18点
        if (hour >= 12 && hour < 18) {
            return GREETING_AFTERNOON;
        }
        // 其他时间
        return GREETING_EVENING;
    }
}
