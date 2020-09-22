package com.example.firstproject11i;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder> {

    List<Contacts> data;
    Context context;

    public ContactsAdapter(List<Contacts> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_rv, parent, false);
        return new ContactsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder holder, int position) {
        holder.tv_contact.setText(data.get(position).getName());
        holder.imgv_contact.setImageResource(data.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ContactsViewHolder extends RecyclerView.ViewHolder{

        ImageView imgv_contact;
        TextView tv_contact;

        public ContactsViewHolder(@NonNull View itemView) {
            super(itemView);

            imgv_contact = itemView.findViewById(R.id.imgv);
            tv_contact = itemView.findViewById(R.id.tv);
        }
    }

}
