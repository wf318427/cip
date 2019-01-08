package com.sinosoft.strategy;

/**
 * Created by Administrator on 18.1.30.
 */
@PriceRegion(min = 10000D,max=20000D)
public class Vip implements CalPrice {
    @Override
    public Double calPrice(Double orgnicPrice) {
        return orgnicPrice * 0.9;
    }
}
