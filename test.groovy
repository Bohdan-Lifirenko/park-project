def pickupPhone(String name, Closure<?> phoneNoise) {
    phoneNoise()
    println 'Hello? ' + name + ' here'
}

pickupPhone('Tom', {
    println 'Ring'
})