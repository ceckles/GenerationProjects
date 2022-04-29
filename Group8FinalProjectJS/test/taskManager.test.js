const { assert, expect } = require('chai');
const { beforeEach } = require('mocha');
const Task = require('../js/taskManager');

describe('Task', () => {
    let testNum = 1;
    beforeEach(() => {
        console.log(`    Running test #${testNum++}`);
    });
    describe('TaskName constructor', () => {
        const task = new Task('Walk Dog','Kandace','Walk the dog for 10min','2021-03-31','TODO', '1'); //Task to check
        it('will return Task name property', () => {
            const actualTaskName = task.name;
            const expectedTaskName = 'Walk Dog';
            assert.ok(actualTaskName === expectedTaskName);
        });

        it('will return Task AssignedTo property', () => {
            const actualTaskName = task.assignedTo;
            const expectedTaskName = 'Kandace';
            assert.ok(actualTaskName === expectedTaskName);
        });
    });
});