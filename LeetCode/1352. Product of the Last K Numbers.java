// Unoptimized
class ProductOfNumbers {
    List<Integer> list;    
    List<Integer> prefixProduct;
    public ProductOfNumbers() {
        list = new ArrayList<>();
        prefixProduct = new ArrayList<>();
        prefixProduct.add(1);
    }
    public void add(int num) {
        list.add(num);
        if(num == 0){
            prefixProduct.add(1);
            for(int i = 0; i<prefixProduct.size()-1; i++){
                prefixProduct.set(i,0);
            }
        }else{
            int product = prefixProduct.get(prefixProduct.size()-1);
            if(product == 0){
                prefixProduct.add(num);
            }else{
                prefixProduct.add(num*product);
            }
        }
        
    }
    // 3,0,2,5,4,
    //0,0,0,2,10,40
    public int getProduct(int k) {
        int n = prefixProduct.size();
        int num1 = prefixProduct.get(n-1);
        int num2 = prefixProduct.get(n-1-k);
        if(num1 == 0 || num2 ==0){
            return 0;
        }
        return num1/num2;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */

// Optimized

class ProductOfNumbers {
    List<Integer> product;
    int pro;
    public ProductOfNumbers() {
        product = new ArrayList<>();
        pro = 1;
    }
    
    public void add(int num) {
        if(num == 0){
            product = new ArrayList<>();
            pro =1;
        }else{
            pro = pro*num;
            product.add(pro);
        }
    }
    
    public int getProduct(int k) {
        if(k > product.size()){
            return 0;
        }
        int res = product.get(product.size()-1);
        if(k == product.size())return res;
        return res/product.get(product.size()-1-k);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
