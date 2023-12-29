package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PAdapter extends RecyclerView.Adapter<PAdapter.ViewHolder> {

    ArrayList<P> product;
    ItemSelected parentActivity;

    public interface ItemSelected
    {
        public void onItemClicked(int index);
    }
    public PAdapter(Context context, ArrayList<P> list)
    {
        parentActivity = (ItemSelected) context;
        product = list;
    }
    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView ivPref;
        TextView tvName, tvSurname;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivPref= itemView.findViewById(R.id.ivPref);
            tvName= itemView.findViewById(R.id.tvName);
            tvSurname= itemView.findViewById(R.id.tvColor);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    parentActivity.onItemClicked(product.indexOf((P) itemView.getTag()));

                }
            });
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);


        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.itemView.setTag(product.get(position));

        holder.tvName.setText(product.get(position).getName());
        holder.tvSurname.setText(product.get(position).getColor());

        if(product.get(position).getPreference().equals("lp"))
        {
            holder.ivPref.setImageResource(R.drawable.lp);
        }
        else if (product.get(position).getPreference().equals("s"))
        {
            holder.ivPref.setImageResource(R.drawable.s);
        }
        else if (product.get(position).getPreference().equals("eb"))
        {
            holder.ivPref.setImageResource(R.drawable.eb);
        }
        else if (product.get(position).getPreference().equals("h"))
        {
            holder.ivPref.setImageResource(R.drawable.h);
        }
    }

    @Override
    public int getItemCount() {
        return product.size();
    }
}
