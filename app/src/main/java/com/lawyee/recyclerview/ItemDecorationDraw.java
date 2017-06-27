package com.lawyee.recyclerview;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * All rights Reserved, Designed By www.lawyee.com
 *
 * @version V 1.0 xxxxxxxx
 * @Title: RecyclerView
 * @Package com.lawyee.recyclerview
 * @Description: $todo$
 * @author: YFL
 * @date: 2017/6/23 11:31
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2017 www.lawyee.com Inc. All rights reserved.
 * 注意：本内容仅限于北京法意科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class ItemDecorationDraw extends RecyclerView.ItemDecoration {
    private int mHeight = 5; //分割线高度
    @Override
    public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
        super.onDraw(c, parent, state);
        c.save();
        int left = parent.getLeft();
        int right = parent.getRight();
        int childCount = parent.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = parent.getChildAt(i);
            int adapterPosition = parent.getChildAdapterPosition(childAt);
            int bottom = childAt.getTop();
            int top = bottom - mHeight;
        }
    }

    @Override
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {
        super.onDrawOver(c, parent, state);
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        int position = parent.getChildAdapterPosition(view);
        if(position!=0){
            //第一个item预留空间
            outRect.top=mHeight;
        }
    }

}
