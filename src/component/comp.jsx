function Fruits() {
    let fruits = [{ name: "apple", color: "red", price: 100, emoji: "🍎" },
    { name: "banana", color: "yellow", price: 200, emoji: "🍌" },
    { name: "grapes", color: "green", price: 150, emoji: "🍇" },
    ];
    let nature = fruits.map((fruits) => {
        return (
            <div key={fruits.name}>
                <h1>{fruits.name}</h1>
                <h2>{fruits.color}</h2>
                <h3>{fruits.price}</h3>
                <h4>{fruits.emoji}</h4>
            </div>
        )
    })
    return nature;


}
export default Fruits;