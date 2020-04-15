import java.util.ArrayList;
import java.util.List;

    public class CommandInvoker {
        private List<interfejs> orderList = new ArrayList<interfejs>();

        public void takeOrder(interfejs interfejs){
            orderList.add(interfejs);
        }

        public void placeOrders(){

            for (interfejs order : orderList) {
                order.execute();
            }
            orderList.clear();
        }
    }
