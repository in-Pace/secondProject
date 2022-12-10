package Task4;

import java.util.ArrayList;

public class Shop {
    ArrayList<Goods> goods = new ArrayList<>();

    public void addGood(Goods goods){
        this.goods.add(goods);
    }
    public void removeGood(Goods goods){
        this.goods.remove(goods);
    }
    public Goods findGood(Goods goods){
        for (Goods comp: this.goods){
            if(comp == goods){
                return goods;
            } else return null;
        }
        return null;
    }
}