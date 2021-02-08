
//Our base class.We can manage all project from this class.
public class ProjectManager {
    public void Add(IPersonManager personManager)
    {
        personManager.Add();
    }
}
