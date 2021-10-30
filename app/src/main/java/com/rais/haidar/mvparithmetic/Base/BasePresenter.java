package com.rais.haidar.mvparithmetic.Base;

/**
 * Created by Hoidar on 10/11/18.
 */
//bang bang ini buat apaan bang yak?
public interface BasePresenter <T extends BaseView> {
    void onAttach(T v);
}
