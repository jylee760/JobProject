import axios from 'axios'
export async function retrieveJobs(jobType,location,searchField,distanceFilter){
    let searchContent = searchField.replace(/ /g, '%20');
    const contentType = `&content-type=application/json`;
    const link = `/api/v1/api/jobs/us/search/1?app_id=a93ec7ad&app_key=9a62d01687d7f82a19bbafe6e0e77d67&results_per_page=20&where=${location}&distance=${distanceFilter}&title_only=${searchContent}`;
    let job=""
    if(jobType!==null){
        job = `&${jobType}=1`
    }
    const apiReq = link+job+contentType;
    try{
        const response = await axios.get(apiReq);
        return response.data;
    }catch(error){
        console.error('error:',error);
        throw error;
    }
}