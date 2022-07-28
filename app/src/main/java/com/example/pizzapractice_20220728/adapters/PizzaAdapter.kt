package com.example.pizzapractice_20220728.adapters

import android.content.Context
import android.content.LocusId
import android.widget.ArrayAdapter
import com.example.pizzapractice_20220728.datas.PizzaData

class PizzaAdapter(
    mContext: Context,
    resInt: Int,
    mList: PizzaData
) : ArrayAdapter<>(mContext, resId, mList) {
}