function merge(intervals: number[][]): number[][] {
    intervals.sort((a, b) => a[0] - b[0])

    let current = intervals[0]
    const result = []

    for (let i = 1; i < intervals.length; i++) {
        if (current[1] < intervals[i][0]) {
            result.push(current)
            current = intervals[i]
        } else {
            current[1] = Math.max(intervals[i][1], current[1])
        }
    }

    result.push(current)

    return result
};