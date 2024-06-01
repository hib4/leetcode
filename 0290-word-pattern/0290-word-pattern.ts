function wordPattern(pattern: string, s: string): boolean {
    const x = new Map()
    const y = new Map()
    const words = s.split(' ')

    if (pattern.length != words.length) return false

    for (let i = 0; i < pattern.length; i++) {
        const p = pattern[i]
        const w = words[i]

        if (x.get(p) !== y.get(w)) return false

        x.set(p, i)
        y.set(w, i)
    }

    return true
};