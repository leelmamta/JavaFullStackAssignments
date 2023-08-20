const assert = require('chai').assert; 
// const app = require('../app')
const sayHello = require('../app').sayHello; 
const Add = require('../app').AddNumbers;

describe('App', function(){
    it('app should  return adarsh', function(){
        assert.equal(sayHello(), 'adarsh')
    })
    it("It shoudl return typeof string", function(){
        let res = sayHello(); 
        assert.typeOf(res, 'string'); 
    })
    it("It should return if it is above or not ", function(){
         let res  = Add(7,8); 
         assert.isAbove(res, 10); 
    })
})