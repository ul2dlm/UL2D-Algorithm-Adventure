// this는 함수가 호출될 때 결정 된다.
// 화살표 함수에서의 this는 함수가 속해 있는 곳 상위의 this를 계승받는다
car = {
    name: "KIA",
    getName: function() {
        console.log("Car getName:", this);
    },
};

//1.
//car.getName(); A.b

// 2.
const globalCar = car.getName;
globalCar(); //b

const car2 = {
    name: 'hyundai',
    getName: car.getName
}
car2.getName()


carTest = {
    name: "KIA",
    getName: function() {
        console.log("Car getName:", this);
    },
};
