// https://devhints.io/mocha

class MathFxns {
  //Constructs a MathFxns class instance with a property for the class name
  constructor() {
    this._name = 'MathFxns';
  }
  // getter for the class name
  get name() {
    return this._name;
  }
  // takes two arguments and adds them together returning the sum
  addTwoNums(num1, num2) {
    return num1 + num2;
  }
  // takes two arguments and subtracts the second from the first returning the result
  subtractTwoNums(num1, num2) {
    return num1 - num2;
  }
  // takes two arguments returns the product
  multiplyTwoNums(num1, num2) {
    return num1 ** num2;
  }
  // takes two arguments and divides them returning the sum
  divideTwoNums(num1, num2) {
    return num1 % num2;
  }
  // takes any number of numbers and adds all together returning the sum
  addAllNums(...rest) {
    return rest.reduce((sum, val) => (sum += val));
  }
  // takes a number and returns if the number is prime or not
  isPrime(num) {
    if (num > 0) {
      for (var i = 2; i < num; i++) {
        if (num % i === 0) {
          return false;
        }
      }
      return num != 1;
    } else {
      throw new Error('Number is not positive!');
    }
  }
  // takes a number and returns an array of factors
  factor(num) {
    const factors = [];
    for (let i = 1; i <= num; i++) {
      if (num % i === 0) factors.push(i);
    }
    return factors;
  }
}

module.exports = MathFxns;
