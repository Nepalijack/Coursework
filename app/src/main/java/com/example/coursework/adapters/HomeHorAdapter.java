package com.example.coursework.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.coursework.R;
import com.example.coursework.models.HomeHorModel;
import com.example.coursework.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;


public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.ViewHolder> {

    UpdateVerticalRec updateVerticalRec;
    Activity activity;
    ArrayList<HomeHorModel> list;

    boolean check = true;
    boolean select = true;
    int row_index = -1;

    public HomeHorAdapter(UpdateVerticalRec updateVerticalRec, Activity activity, ArrayList<HomeHorModel> list) {
        this.updateVerticalRec = updateVerticalRec;
        this.activity = activity;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horizontal_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());

        if (check) {

            ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
            homeVerModels.add(new HomeVerModel(R.drawable.starter, "Lamb Tikka", "5.0", "17:00 - 21:00", "Min - £8.50"));
            homeVerModels.add(new HomeVerModel(R.drawable.starter2, "Chicken Tikka", "5.0", "17:00 - 21:00", "Min - £7.50"));
            homeVerModels.add(new HomeVerModel(R.drawable.starter3, "Samosa", "5.0", "17:00 - 21:00", "Min - £6.50"));
            homeVerModels.add(new HomeVerModel(R.drawable.starter4, "Chicken Pakora", "5.0", "17:00 - 21:00", "Min - £5.50"));

            updateVerticalRec.callBack(position, homeVerModels);

            check = false;
        }
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                row_index = position;
                notifyDataSetChanged();

                if (position == 0) {

                    ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                    homeVerModels.add(new HomeVerModel(R.drawable.starter, "Lamb Tikka", "5.0", "17:00 - 21:00", "Min - £8.50"));
                    homeVerModels.add(new HomeVerModel(R.drawable.starter2, "Chicken Tikka", "5.0", "17:00 - 21:00", "Min - £7.50"));
                    homeVerModels.add(new HomeVerModel(R.drawable.starter3, "Samosa", "5.0", "17:00 - 21:00", "Min - £6.50"));
                    homeVerModels.add(new HomeVerModel(R.drawable.starter4, "Chicken Pakora", "5.0", "17:00 - 21:00", "Min - £5.50"));

                    updateVerticalRec.callBack(position, homeVerModels);
                }

                else if (position == 1){

                    ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                    homeVerModels.add(new HomeVerModel(R.drawable.mains1, "Chicken Tikka Masala", "5.0", "17:00 - 21:00", "Min - £11.00"));
                    homeVerModels.add(new HomeVerModel(R.drawable.mains2, "Chicken Korma", "5.0", "17:00 - 21:00", "Min - £11.50"));
                    homeVerModels.add(new HomeVerModel(R.drawable.mains3, "Chicken Balti", "5.0", "17:00 - 21:00", "Min - £11.50"));
                    homeVerModels.add(new HomeVerModel(R.drawable.main4, "Chicken Bhoona", "5.0", "17:00 - 21:00", "Min - £12.50"));

                    updateVerticalRec.callBack(position, homeVerModels);


                }
                else if (position == 2){

                    ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                    homeVerModels.add(new HomeVerModel(R.drawable.rice1, "Boiled Rice", "5.0", "17:00 - 21:00", "Min - £3.00"));
                    homeVerModels.add(new HomeVerModel(R.drawable.rice2, "Pilau Rice", "5.0", "17:00 - 21:00", "Min - £3.50"));
                    homeVerModels.add(new HomeVerModel(R.drawable.rice3, "Mushroom Rice", "5.0", "17:00 - 21:00", "Min - £3.90"));
                    homeVerModels.add(new HomeVerModel(R.drawable.rice4, "Egg Pilau Rice", "5.0", "17:00 - 21:00", "Min - £3.90"));

                    updateVerticalRec.callBack(position, homeVerModels);


                }
                else if (position == 3){

                    ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                    homeVerModels.add(new HomeVerModel(R.drawable.nan1, "Plain Nan", "5.0", "17:00 - 21:00", "Min - £3.00"));
                    homeVerModels.add(new HomeVerModel(R.drawable.nan2, "Peshwari Nan", "5.0", "17:00 - 21:00", "Min - £3.50"));
                    homeVerModels.add(new HomeVerModel(R.drawable.nan3, "Butter Nan", "5.0", "17:00 - 21:00", "Min - £3.50"));
                    homeVerModels.add(new HomeVerModel(R.drawable.nan4, "Garlic Nan", "5.0", "17:00 - 21:00", "Min - £3.90"));

                    updateVerticalRec.callBack(position, homeVerModels);


                }
                else if (position == 4){

                    ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                    homeVerModels.add(new HomeVerModel(R.drawable.pizza1, "Cheese Pizza", "5.0", "17:00 - 21:00", "Min - £11.00"));
                    homeVerModels.add(new HomeVerModel(R.drawable.pizza2, "Pepperoni Pizza", "5.0", "17:00 - 21:00", "Min - £11.00"));
                    homeVerModels.add(new HomeVerModel(R.drawable.pizza3, "Hot N' Spicy", "5.0", "17:00 - 21:00", "Min - £11.00"));
                    homeVerModels.add(new HomeVerModel(R.drawable.pizza4, "BBQ Sizzler", "5.0", "17:00 - 21:00", "Min - £11.00"));

                    updateVerticalRec.callBack(position, homeVerModels);


                }
            }
        });

        if (select) {
            if (position == 0){
                holder.cardView.setBackgroundResource(R.drawable.change_bg);
                select = false;
            }
        }
        else {
            if (row_index == position){
                holder.cardView.setBackgroundResource(R.drawable.change_bg);
            }else {
                holder.cardView.setBackgroundResource(R.drawable.default_bg);
            }
        }


    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name;
        CardView cardView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.hor_img);
            name = itemView.findViewById(R.id.hor_text);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}