package com.example.maryamch.github;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by abbas on 5/13/2016.
 */
public class ProductAdapter extends BaseAdapter {

    Context context;
    List<Product> productList;

    public ProductAdapter(Context context, List<Product> productList) {
        this.context = context;
        this.productList = productList;
    }

    @Override
    public int getCount() {
        return productList.size();
    }

    @Override
    public Product getItem(int position) {
        return productList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.product_grid_item, null);
        }
        ImageView ivIcon = (ImageView) convertView.findViewById(R.id.imageview_product_image);
        TextView tvName = (TextView) convertView.findViewById(R.id.textview_product_name);

        Product currentProduct = getItem(position);

        ivIcon.setImageResource(currentProduct.getImage());
        tvName.setText(currentProduct.getName());

        return convertView;
    }
}
