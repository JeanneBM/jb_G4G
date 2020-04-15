import java.util.ArrayList;
import java.util.List;

    public class CommandInvoker {
        private List<Interfejs> orderList = new ArrayList<Interfejs>();

        public void takeOrder(Interfejs interfejs){
            orderList.add(interfejs);
        }

        public void placeOrders(){

            for (Interfejs interfejs : orderList) {
                order.execute();
            }
            orderList.clear();
        }
    }
