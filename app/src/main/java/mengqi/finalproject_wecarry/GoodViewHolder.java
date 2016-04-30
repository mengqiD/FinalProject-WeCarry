package mengqi.finalproject_wecarry;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Lu on 2/23/2016.
 */
public class GoodViewHolder extends RecyclerView.ViewHolder {
    public CardView goodsCard;
    public TextView goodsDeparture;
    public TextView goodsArrival;
    public TextView goodsFlex;
    public TextView goodsContent;
    public TextView goodsTime;
    private Context context;


    public GoodViewHolder(View itemView, final Context context) {
        super(itemView);
        goodsCard = (CardView) itemView.findViewById(R.id.goods_card);
        goodsDeparture = (TextView) itemView.findViewById(R.id.goods_departure);
        goodsArrival = (TextView) itemView.findViewById(R.id.goods_arrival);
        goodsFlex = (TextView) itemView.findViewById(R.id.goods_flexibility);
        goodsContent = (TextView) itemView.findViewById(R.id.goods_content);
        goodsTime = (TextView) itemView.findViewById(R.id.goods_time);
        this.context = context;
    }

    public void bind(final Good good) {
        goodsTime.setText(good.datePreferred);
        goodsContent.setText(good.whatToCarry);
//        goodsFlex.setText(good.flexibility);
        goodsArrival.setText(good.arrivalArea);
        goodsDeparture.setText(good.departureArea);

        goodsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, goodsContent.getText(), Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(v.getContext(),GoodsActivity.class);
                //intent.putExtra("Good", good);
                v.getContext().startActivity(intent);

            }
        });
    }

}
