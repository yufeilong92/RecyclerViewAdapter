package com.lawyee.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * All rights Reserved, Designed By www.lawyee.com
 *
 * @version V 1.0 xxxxxxxx
 * @Title: RecyclerView
 * @Package com.lawyee.recyclerview
 * @Description: $todo$
 * @author: YFL
 * @date: 2017/6/21 10:04
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2017 www.lawyee.com Inc. All rights reserved.
 * 注意：本内容仅限于北京法意科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class RecyclerItemViewAdapter extends RecyclerView.Adapter<RecyclerItemViewAdapter.ViewHolder> implements View.OnClickListener,ItemTouchHelperAdapter {
    private List<String> mData;
    private Context mContext;
    private final LayoutInflater mInflater;

    private RecyclerItemChickListener itemChickListener = null;

    public RecyclerItemChickListener getItemChickListener() {
        return itemChickListener;
    }

    public void setItemChickListener(RecyclerItemChickListener itemChickListener) {
        this.itemChickListener = itemChickListener;
    }

    @Override
    public void onClick(View v) {
        if (itemChickListener != null) {
            itemChickListener.OnItemChickListener(v, (String) v.getTag());
        }
    }

    @Override
    public void OnItemMove(int fromPosition, int toPosition) {
        Collections.swap(mData,fromPosition,toPosition);
       notifyItemMoved(fromPosition,toPosition);
    }

    @Override
    public void onItemDissmiss(int position) {
         mData.remove(position);
        notifyItemRemoved(position);
    }

    public interface RecyclerItemChickListener {
        void OnItemChickListener(View v, String item);
    }

    public RecyclerItemViewAdapter(List<String> mData, Context mContext) {
        this.mData = mData;
        this.mContext = mContext;
        mInflater = LayoutInflater.from(mContext);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_recycler, null);
        ViewHolder holder = new ViewHolder(view);
        view.setOnClickListener(this);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
          holder.tv.setText(mData.get(position));
          holder.itemView.setTag(mData.get(position));

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tv)
        TextView tv;
        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}
