import java.util.ArrayList;
import java.util.List;

    public class CommandInvoker {
        private List<Interfejs> orderList = new ArrayList<Interfejs>();

        public void takeOrder(Interfejs interfejs){
            orderList.add(Interfejs);
        }

        public void placeOrders(){

            for (interfejs order : orderList) {
                order.execute();
            }
            orderList.clear();
        }
    }
