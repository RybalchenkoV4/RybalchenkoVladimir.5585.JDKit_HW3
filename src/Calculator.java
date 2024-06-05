class Calculator {

    static <F extends Number, S extends Number> double sum(F a, S b) {
        return a.doubleValue() + b.doubleValue();
    }

    static <F extends Number, S extends Number> double multiply(F a, S b) {
        return a.doubleValue() * b.doubleValue();
    }

    static <F extends Number, S extends Number> double divide(F a, S b) {
        if(b.doubleValue() == 0){
            throw new ArithmeticException("Делить на ноль НЕЛЬЗЯ!");
        }
        return a.doubleValue() / b.doubleValue();

    }

    static <F extends Number, S extends Number> double subtract(F a, S b) {
        return a.doubleValue() - b.doubleValue();
    }
}
