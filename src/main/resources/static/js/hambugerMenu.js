const menuIcon = document.getElementById("roll")
const menuDiv = document.getElementById("menu")

const rollBack = document.getElementById("rollBack")

console.log(menuDiv)

menuIcon.addEventListener('click', () =>{
    menuIcon.style.display = "none"
    menuDiv.style.display = "block"
})

rollBack.addEventListener('click', () => {
    menuIcon.style.display = "block"
    menuDiv.style.display = "none"
})