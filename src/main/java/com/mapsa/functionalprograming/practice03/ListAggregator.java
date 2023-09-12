package com.mapsa.functionalprograming.practice03;

import java.util.List;

public interface ListAggregator<T, R>  {

     R aggregate(List<T> list);
}
