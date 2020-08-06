package com.example.algorithm.datastructuresalgorithms.algor.lambda;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/3/3 上午10:01
 */
public class TestLambda {
    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("activityOriginMoney",5);
        map.put("activityStepMoney",2);
        map.put("activityMaxMoney",10);
        map.put("activityOriginValue",3);
        map.put("activityStepValue",2);
        BigDecimal bigDecimal = computeActivityReward(map, 8);
        System.out.println(bigDecimal);
    }

    /**
     * @param config 配置信息
     *               - activityOriginMoney  初始奖金
     *               - activityStepMoney    步进奖金
     *               - activityMaxMoney     封顶奖金
     *               - activityOriginValue  初始值
     *               - activityStepValue    步进值
     * @param count  活动期间内完成的委托份数
     * @return
     */
    private static BigDecimal computeActivityReward(Map<String, Object> config, int count) {
        BigDecimal activityOriginMoney = new BigDecimal(config.get("activityOriginMoney").toString());
        BigDecimal activityStepMoney = new BigDecimal(config.get("activityStepMoney").toString());
        BigDecimal activityMaxMoney = new BigDecimal(config.get("activityMaxMoney").toString());
        int activityOriginValue = Integer.parseInt(config.get("activityOriginValue").toString());
        int activityStepValue = Integer.parseInt(config.get("activityStepValue").toString());

        BigDecimal activityReward = new BigDecimal("0.00");
        if (count >= activityOriginValue) {
            activityReward = activityOriginMoney;
            int number = (count - activityOriginValue ) / activityStepValue;
            if (number != 0) {
                activityReward = activityReward.add(activityStepMoney.multiply(new BigDecimal(number)));
                if (activityReward.compareTo(activityMaxMoney) == 1) {
                    //大于封顶金额  使用封顶金额
                    activityReward = activityMaxMoney;
                }
            }
        }
        return activityReward;
    }
}
