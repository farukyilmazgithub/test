package Generic;

public class GenericClass<K,O,D> {
    K object1;
    O object2;
    D object3;

    public GenericClass(K i, O a, D v) {
        this.object1 = i;
        this.object2 = a;
        this.object3 = v;
    }

    public K getObject1() {
        return object1;
    }

    public void setObject1(K object1) {
        this.object1 = object1;
    }

    public O getObject2() {
        return object2;
    }

    public void setObject2(O object2) {
        this.object2 = object2;
    }

    public D getObject3() {
        return object3;
    }

    public void setObject3(D object3) {
        this.object3 = object3;
    }

    public void showinfos(){
        System.out.println("object1: "+ getObject1());
        System.out.println("object2: "+ getObject2());
        System.out.println("object3: "+ getObject3());
    }
}
