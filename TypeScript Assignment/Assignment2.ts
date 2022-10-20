let fruits: Array<string>;
fruits = ['Apple', 'Grapes', 'Mango']; 
let printStrLength = (fruits: Array<string>) => {
    for(var i=0; i<fruits.length; i++){
        console.log("String is "+fruits[i]+" and its length is : "+fruits[i].length);
    }
}

printStrLength(fruits);