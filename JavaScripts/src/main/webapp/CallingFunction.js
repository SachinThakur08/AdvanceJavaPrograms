function cutFruitpieces(fruit) {
    return fruit * 4;
}

function fruitprocessor(apples, oranges) {
    const applePieces = cutFruitpieces(apples);
    const orangePieces = cutFruitpieces(oranges);
    return `Juice preparing with ${applePieces} applespieces & ${orangePieces}-orangespieces`;
}

const apples = 8;
const oranges = 6;

const juiceMessage = fruitprocessor(apples, oranges);

console.log(juiceMessage);