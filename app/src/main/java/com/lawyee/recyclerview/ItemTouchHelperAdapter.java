package com.lawyee.recyclerview;

/**
 * All rights Reserved, Designed By www.lawyee.com
 *
 * @version V 1.0 xxxxxxxx
 * @Title: RecyclerView
 * @Package com.lawyee.recyclerview
 * @Description: $todo$
 * @author: YFL
 * @date: 2017/6/21 14:32
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2017 www.lawyee.com Inc. All rights reserved.
 * 注意：本内容仅限于北京法意科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public interface ItemTouchHelperAdapter  {
    //数据交换
    void OnItemMove(int fromPosition, int toPosition);
   //数据删除
    void onItemDissmiss(int position);

}
