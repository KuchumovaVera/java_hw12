package ru.netology.product;

public class ProductRepository {
    private Product[] products = new Product[0];

        public void save(Product newProduct) {
        int length = products.length + 1;
        Product[] tmp = new Product[length];

        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = newProduct;

        products = tmp;
    }

    public Product[] findAll() {
        return products;
    }

    //удалить объект по id
    public void removeById(int id) {
        int length = products.length - 1;
        Product[] tmp = new Product[length];
        int index = 0;
        for (Product product:products) {
            if (product.getId() !=id){
                tmp[index]=product;
                index++;
            }
        }
        products = tmp;
    }
}
