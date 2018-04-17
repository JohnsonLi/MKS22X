public class Sort{


    public static void radixSort(MyLinkedListImproved<Integer> list){
        // jrefioewhoifuiowhefouiweh
        // @SuppressWarnings("unchecked") MyLinkedListImproved<Integer>[] cup = new MyLinkedListImproved[10];
        // for(int i = 0; i < 10; i++){
        //     cup[i] = new MyLinkedListImproved<Integer>(); 
        //     // System.out.println(cup[i].toString());
        // }

        if(list.size() == 0){
            return;
        }

        int maxDigits = (int)(Math.log10(list.get(list.max())) + 1);
        int currentDigit = 0;

        //BUCKETS HAVE TO BE EMPTY AUIEFWEFFWEFOIWEFHOIWEHF
        while(maxDigits > 0){
            @SuppressWarnings("unchecked") MyLinkedListImproved<Integer>[] cup = new MyLinkedListImproved[10];
            for(int i = 0; i < 10; i++){
                cup[i] = new MyLinkedListImproved<Integer>(); 
            }

            for(Integer value : list){
                cup[(int)(Math.abs(value) / Math.pow(10, currentDigit) % 10)].add(value);
            }

            list.clear();
            for(int i = 0; i < cup.length; i++){
                list.extend(cup[i]);
            }

            currentDigit++;
            maxDigits--;
        }

        for(Integer value : list){
            if(value < 0){
                list.remove(value);
                list.add(0, value);
            }
        }
    }
    
    // public static void main(String[] args) {
    //     MyLinkedListImproved<Integer> list = new MyLinkedListImproved<>();
    //     list.add(-2391);
    //     list.add(11231);
    //     list.add(-2);
    //     list.add(2312312);
    //     list.add(1213);
    //     list.add(-23421);
    //     list.add(154);
    //     list.add(1890);
    //     list.add(-1);
    //     System.out.println(list);
    //     Sort.radixSort(list);
    //     System.out.println(list);
    //     // int a = 21393;
    //     // System.out.println(Math.floor(a / Math.pow(10, 5) % 10));
    //     // System.out.println(Integer.toString(a).length());
    // }
}