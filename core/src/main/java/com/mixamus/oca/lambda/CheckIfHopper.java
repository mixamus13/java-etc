package com.mixamus.oca.lambda;

class CheckIfHopper implements CheckTrait {
    @Override
    public boolean test(J07AnimalLambdas lambdas) {
        return lambdas.isCanHop();
    }
}
