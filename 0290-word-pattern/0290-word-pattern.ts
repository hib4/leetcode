function wordPattern(pattern: string, s: string): boolean {
    const x = new Map()
    const y = new Map()
    const words = s.split(' ')

    if (pattern.length !=  words.length) return false

    for (let i = 0; i < pattern.length; i++) {
        const p = pattern[i]
        const w = words[i]

        if (x.has(p) && x.get(p) !== w) {
            return false
        } else {
            x.set(p, w)
        }

        if (y.has(w) && y.get(w) !== p) {
            return false
        } else {
            y.set(w, p)
        }
    }

    return true
};