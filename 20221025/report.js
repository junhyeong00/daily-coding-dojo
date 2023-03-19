function solution(id_list, report, k) {
    const reportRecord = [...new Set(report)];
    const reportCount = [...Array(id_list.length)].fill(0);
    const reportedUser = [];
    const mailCount = [...Array(id_list.length)].fill(0);
    
    reportRecord.forEach((users) => {
        const from = users.split(' ')[0];
        const to = users.split(' ')[1];
        const index = id_list.indexOf(to);
        reportCount[index] += 1;
        
        if (reportCount[index] >= k) {
            reportedUser.push(id_list[index]);
        }
    })
    
    reportRecord.map((users) => {
        const from = users.split(' ')[0];
        const to = users.split(' ')[1];
        
        if (reportedUser.indexOf(to) >= 0) {
            const index = id_list.indexOf(from);
            mailCount[index] += 1;
        }
    })

    return mailCount;
}
