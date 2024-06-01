class RandomizedSet {
    private readonly array: number[]
    private map: Map<number, number>

    constructor() {
        this.array = []
        this.map = new Map()
    }

    insert(val: number): boolean {
        if (this.map.has(val)) {
            return false
        }
        this.map.set(val, this.array.length)
        this.array.push(val)
        return true
    }

    remove(val: number): boolean {
        if (!this.map.has(val)) {
            return false
        }
        const index = this.map.get(val)! // 1
        const last = this.array[this.array.length - 1] // 2
        this.map.set(last, index)
        this.array[index] = last
        this.array.pop()
        this.map.delete(val)
        return true
    }

    getRandom(): number {
        const index = Math.floor(Math.random() * this.array.length)
        return this.array[index]
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * var obj = new RandomizedSet()
 * var param_1 = obj.insert(val)
 * var param_2 = obj.remove(val)
 * var param_3 = obj.getRandom()
 */