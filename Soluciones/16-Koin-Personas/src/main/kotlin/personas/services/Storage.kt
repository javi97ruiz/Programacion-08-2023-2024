package personas.services

interface Storage<T> {
    fun save(item: T): T
}
